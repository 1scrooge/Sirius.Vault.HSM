// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hsm.proto

package com.ibm.crypto.grep11.grpc;

public interface SignSingleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grep11.SignSingleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes PrivKey = 1;</code>
   *
   * @return The privKey.
   */
  com.google.protobuf.ByteString getPrivKey();

  /**
   * <code>.grep11.Mechanism Mech = 2;</code>
   *
   * @return Whether the mech field is set.
   */
  boolean hasMech();
  /**
   * <code>.grep11.Mechanism Mech = 2;</code>
   *
   * @return The mech.
   */
  com.ibm.crypto.grep11.grpc.Mechanism getMech();
  /** <code>.grep11.Mechanism Mech = 2;</code> */
  com.ibm.crypto.grep11.grpc.MechanismOrBuilder getMechOrBuilder();

  /**
   * <code>bytes Data = 3;</code>
   *
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
