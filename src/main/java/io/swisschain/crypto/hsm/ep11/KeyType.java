package io.swisschain.crypto.hsm.ep11;

public enum KeyType {
  CKK_RSAL(0L),
  CKK_DSAL(1L),
  CKK_DHL(2L),
  CKK_ECL(3L),
  CKK_ECDSAL(3L),
  CKK_X9_42_DHL(4L),
  CKK_KEAL(5L),
  CKK_GENERIC_SECRETL(16L),
  CKK_RC2L(17L),
  CKK_RC4L(18L),
  CKK_DESL(19L),
  CKK_DES2L(20L),
  CKK_DES3L(21L),
  CKK_CASTL(22L),
  CKK_CAST3L(23L),
  CKK_CAST128L(24L),
  CKK_CAST5L(24L),
  CKK_RC5L(25L),
  CKK_IDEAL(26L),
  CKK_SKIPJACKL(27L),
  CKK_BATONL(28L),
  CKK_JUNIPERL(29L),
  CKK_CDMFL(30L),
  CKK_AESL(31L),
  CKK_BLOWFISHL(32L),
  CKK_TWOFISHL(33L),
  CKK_SECURIDL(34L),
  CKK_HOTPL(35L),
  CKK_ACTIL(36L),
  CKK_CAMELLIAL(37L),
  CKK_ARIAL(38L),
  CKK_SHA512_224_HMACL(39L),
  CKK_SHA512_256_HMACL(40L),
  CKK_SHA512_T_HMACL(41L),
  CKK_SHA_1_HMACL(64L),
  CKK_SHA224_HMACL(65L),
  CKK_SHA256_HMACL(66L),
  CKK_SHA384_HMACL(67L),
  CKK_SHA512_HMACL(68L),
  CKK_SEEDL(80L),
  CKK_GOSTR3410L(96L),
  CKK_GOSTR3411L(97L),
  CKK_GOST28147L(98L),
  CKK_VENDOR_DEFINEDL(2147483648L),
  CKK_IBM_SM4L(2147811329L),
  CKK_IBM_SM2L(2147811330L),
  CKK_IBM_EPX_SYMML(3776053248L),
  CKK_IBM_EPX_ASYMML(3776118784L),
  CKK_IBM_EPX_ASYMM_PRIVL(3776184320L),
  CKK_IBM_EPX_ASYMM_PUBL(3776249856L);

  public Long value;

  KeyType(Long value) {
    this.value = value;
  }
}
