package io.swisschain.crypto.address.generation.generators;

import io.swisschain.config.HsmConfig;
import io.swisschain.crypto.NetworkMapper;
import io.swisschain.crypto.address.generation.AddressGenerationResult;
import io.swisschain.crypto.address.generation.AddressGenerator;
import io.swisschain.crypto.exceptions.UnknownNetworkTypeException;
import io.swisschain.primitives.NetworkType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class HsmBitcoinAddressGenerator extends HsmBitcoinBasedAddressGenerator
    implements AddressGenerator {
  private static final Logger logger = LogManager.getLogger();

  public HsmBitcoinAddressGenerator(HsmConfig hsmConfig) {
    super(hsmConfig);
  }

  @Override
  public AddressGenerationResult generate(NetworkType networkType)
      throws UnknownNetworkTypeException, IOException {
    var result = generateSegwitAddress(NetworkMapper.mapToBitcoinNetworkType(networkType));
    logger.info(
        "[" + networkType.name() + "]New bitcoin address generated by HSM: " + result.getAddress());
    return result;
  }
}
