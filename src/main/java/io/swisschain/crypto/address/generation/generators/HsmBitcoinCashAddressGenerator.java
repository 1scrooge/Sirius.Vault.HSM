package io.swisschain.crypto.address.generation.generators;

import io.swisschain.config.HsmConfig;
import io.swisschain.crypto.NetworkMapper;
import io.swisschain.crypto.address.generation.AddressGenerationResult;
import io.swisschain.crypto.address.generation.AddressGenerator;
import io.swisschain.crypto.exceptions.UnknownNetworkTypeException;
import io.swisschain.primitives.NetworkType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bitcoinjcash.core.CashAddress;
import org.bitcoinjcash.core.ECKey;
import org.bouncycastle.util.encoders.Hex;

import java.io.IOException;

public class HsmBitcoinCashAddressGenerator extends HsmBitcoinBasedAddressGenerator
    implements AddressGenerator {
  private static final Logger logger = LogManager.getLogger();

  public HsmBitcoinCashAddressGenerator(HsmConfig hsmConfig) {
    super(hsmConfig);
  }

  @Override
  public AddressGenerationResult generate(NetworkType networkType)
      throws UnknownNetworkTypeException, IOException {
    var keyPair = generateECDSAKeyPair();

    final var pubKey = ECKey.fromPublicOnly(keyPair.publicKey);
    final var cashAddress =
        CashAddress.fromKey(NetworkMapper.mapToBitcoinCashNetworkType(networkType), pubKey)
            .toCash();
    final var result =
        new AddressGenerationResult(
            cashAddress.toString(),
            Hex.toHexString(keyPair.encryptedPrivateKey),
            null,
            pubKey.getPublicKeyAsHex());
    logger.info(
        "["
            + networkType.name()
            + "]New bitcoin cash address generated by HSM: "
            + result.getAddress());
    return result;
  }
}
