/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.otapi;

public class OTPassword {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OTPassword(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OTPassword obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_OTPassword(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getM_theBlockSize() {
    return otapiJNI.OTPassword_m_theBlockSize_get(swigCPtr, this);
  }

  public boolean isPassword() {
    return otapiJNI.OTPassword_isPassword(swigCPtr, this);
  }

  public SWIGTYPE_p_uint8_t getPassword_uint8() {
    long cPtr = otapiJNI.OTPassword_getPassword_uint8(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint8_t(cPtr, false);
  }

  public String getPassword() {
    return otapiJNI.OTPassword_getPassword(swigCPtr, this);
  }

  public SWIGTYPE_p_uint8_t getPasswordWritable() {
    long cPtr = otapiJNI.OTPassword_getPasswordWritable(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint8_t(cPtr, false);
  }

  public String getPasswordWritable_char() {
    return otapiJNI.OTPassword_getPasswordWritable_char(swigCPtr, this);
  }

  public int setPassword(String szInput, int nInputSize) {
    return otapiJNI.OTPassword_setPassword(swigCPtr, this, szInput, nInputSize);
  }

  public SWIGTYPE_p_int32_t setPassword_uint8(SWIGTYPE_p_uint8_t szInput, SWIGTYPE_p_uint32_t nInputSize) {
    return new SWIGTYPE_p_int32_t(otapiJNI.OTPassword_setPassword_uint8(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(szInput), SWIGTYPE_p_uint32_t.getCPtr(nInputSize)), true);
  }

  public boolean addChar(SWIGTYPE_p_uint8_t theChar) {
    return otapiJNI.OTPassword_addChar(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(theChar));
  }

  public SWIGTYPE_p_int32_t randomizePassword(SWIGTYPE_p_uint32_t nNewSize) {
    return new SWIGTYPE_p_int32_t(otapiJNI.OTPassword_randomizePassword__SWIG_0(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(nNewSize)), true);
  }

  public SWIGTYPE_p_int32_t randomizePassword() {
    return new SWIGTYPE_p_int32_t(otapiJNI.OTPassword_randomizePassword__SWIG_1(swigCPtr, this), true);
  }

  public static boolean randomizePassword_uint8(SWIGTYPE_p_uint8_t szDestination, SWIGTYPE_p_uint32_t nNewSize) {
    return otapiJNI.OTPassword_randomizePassword_uint8(SWIGTYPE_p_uint8_t.getCPtr(szDestination), SWIGTYPE_p_uint32_t.getCPtr(nNewSize));
  }

  public static boolean randomizePassword(String szDestination, SWIGTYPE_p_uint32_t nNewSize) {
    return otapiJNI.OTPassword_randomizePassword__SWIG_2(szDestination, SWIGTYPE_p_uint32_t.getCPtr(nNewSize));
  }

  public boolean isMemory() {
    return otapiJNI.OTPassword_isMemory(swigCPtr, this);
  }

  public SWIGTYPE_p_void getMemory() {
    long cPtr = otapiJNI.OTPassword_getMemory(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SWIGTYPE_p_uint8_t getMemory_uint8() {
    long cPtr = otapiJNI.OTPassword_getMemory_uint8(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint8_t(cPtr, false);
  }

  public SWIGTYPE_p_void getMemoryWritable() {
    long cPtr = otapiJNI.OTPassword_getMemoryWritable(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SWIGTYPE_p_int32_t setMemory(SWIGTYPE_p_void vInput, SWIGTYPE_p_uint32_t nInputSize) {
    return new SWIGTYPE_p_int32_t(otapiJNI.OTPassword_setMemory(swigCPtr, this, SWIGTYPE_p_void.getCPtr(vInput), SWIGTYPE_p_uint32_t.getCPtr(nInputSize)), true);
  }

  public SWIGTYPE_p_int32_t addMemory(SWIGTYPE_p_void vAppend, SWIGTYPE_p_uint32_t nAppendSize) {
    return new SWIGTYPE_p_int32_t(otapiJNI.OTPassword_addMemory(swigCPtr, this, SWIGTYPE_p_void.getCPtr(vAppend), SWIGTYPE_p_uint32_t.getCPtr(nAppendSize)), true);
  }

  public SWIGTYPE_p_int32_t randomizeMemory(SWIGTYPE_p_uint32_t nNewSize) {
    return new SWIGTYPE_p_int32_t(otapiJNI.OTPassword_randomizeMemory__SWIG_0(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(nNewSize)), true);
  }

  public SWIGTYPE_p_int32_t randomizeMemory() {
    return new SWIGTYPE_p_int32_t(otapiJNI.OTPassword_randomizeMemory__SWIG_1(swigCPtr, this), true);
  }

  public static boolean randomizeMemory_uint8(SWIGTYPE_p_uint8_t szDestination, SWIGTYPE_p_uint32_t nNewSize) {
    return otapiJNI.OTPassword_randomizeMemory_uint8(SWIGTYPE_p_uint8_t.getCPtr(szDestination), SWIGTYPE_p_uint32_t.getCPtr(nNewSize));
  }

  public static boolean randomizeMemory(SWIGTYPE_p_void szDestination, SWIGTYPE_p_uint32_t nNewSize) {
    return otapiJNI.OTPassword_randomizeMemory__SWIG_2(SWIGTYPE_p_void.getCPtr(szDestination), SWIGTYPE_p_uint32_t.getCPtr(nNewSize));
  }

  public SWIGTYPE_p_uint32_t getBlockSize() {
    return new SWIGTYPE_p_uint32_t(otapiJNI.OTPassword_getBlockSize(swigCPtr, this), true);
  }

  public boolean Compare(OTPassword rhs) {
    return otapiJNI.OTPassword_Compare(swigCPtr, this, OTPassword.getCPtr(rhs), rhs);
  }

  public SWIGTYPE_p_uint32_t getPasswordSize() {
    return new SWIGTYPE_p_uint32_t(otapiJNI.OTPassword_getPasswordSize(swigCPtr, this), true);
  }

  public SWIGTYPE_p_uint32_t getMemorySize() {
    return new SWIGTYPE_p_uint32_t(otapiJNI.OTPassword_getMemorySize(swigCPtr, this), true);
  }

  public void zeroMemory() {
    otapiJNI.OTPassword_zeroMemory__SWIG_0(swigCPtr, this);
  }

  public static void zeroMemory(SWIGTYPE_p_uint8_t szMemory, SWIGTYPE_p_uint32_t theSize) {
    otapiJNI.OTPassword_zeroMemory__SWIG_1(SWIGTYPE_p_uint8_t.getCPtr(szMemory), SWIGTYPE_p_uint32_t.getCPtr(theSize));
  }

  public static void zeroMemory(SWIGTYPE_p_void vMemory, SWIGTYPE_p_uint32_t theSize) {
    otapiJNI.OTPassword_zeroMemory__SWIG_2(SWIGTYPE_p_void.getCPtr(vMemory), SWIGTYPE_p_uint32_t.getCPtr(theSize));
  }

  public static SWIGTYPE_p_void safe_memcpy(SWIGTYPE_p_void dest, SWIGTYPE_p_uint32_t dest_size, SWIGTYPE_p_void src, SWIGTYPE_p_uint32_t src_length, boolean bZeroSource) {
    long cPtr = otapiJNI.OTPassword_safe_memcpy__SWIG_0(SWIGTYPE_p_void.getCPtr(dest), SWIGTYPE_p_uint32_t.getCPtr(dest_size), SWIGTYPE_p_void.getCPtr(src), SWIGTYPE_p_uint32_t.getCPtr(src_length), bZeroSource);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void safe_memcpy(SWIGTYPE_p_void dest, SWIGTYPE_p_uint32_t dest_size, SWIGTYPE_p_void src, SWIGTYPE_p_uint32_t src_length) {
    long cPtr = otapiJNI.OTPassword_safe_memcpy__SWIG_1(SWIGTYPE_p_void.getCPtr(dest), SWIGTYPE_p_uint32_t.getCPtr(dest_size), SWIGTYPE_p_void.getCPtr(src), SWIGTYPE_p_uint32_t.getCPtr(src_length));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static OTPassword CreateTextBuffer() {
    long cPtr = otapiJNI.OTPassword_CreateTextBuffer();
    return (cPtr == 0) ? null : new OTPassword(cPtr, false);
  }

  public boolean SetSize(SWIGTYPE_p_uint32_t uSize) {
    return otapiJNI.OTPassword_SetSize(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(uSize));
  }

  public OTPassword(int theBlockSize) {
    this(otapiJNI.new_OTPassword__SWIG_0(theBlockSize), true);
  }

  public OTPassword() {
    this(otapiJNI.new_OTPassword__SWIG_1(), true);
  }

  public OTPassword(OTPassword rhs) {
    this(otapiJNI.new_OTPassword__SWIG_2(OTPassword.getCPtr(rhs), rhs), true);
  }

  public OTPassword(String szInput, SWIGTYPE_p_uint32_t nInputSize, int theBlockSize) {
    this(otapiJNI.new_OTPassword__SWIG_3(szInput, SWIGTYPE_p_uint32_t.getCPtr(nInputSize), theBlockSize), true);
  }

  public OTPassword(String szInput, SWIGTYPE_p_uint32_t nInputSize) {
    this(otapiJNI.new_OTPassword__SWIG_4(szInput, SWIGTYPE_p_uint32_t.getCPtr(nInputSize)), true);
  }

  public OTPassword(SWIGTYPE_p_uint8_t szInput, SWIGTYPE_p_uint32_t nInputSize, int theBlockSize) {
    this(otapiJNI.new_OTPassword__SWIG_5(SWIGTYPE_p_uint8_t.getCPtr(szInput), SWIGTYPE_p_uint32_t.getCPtr(nInputSize), theBlockSize), true);
  }

  public OTPassword(SWIGTYPE_p_uint8_t szInput, SWIGTYPE_p_uint32_t nInputSize) {
    this(otapiJNI.new_OTPassword__SWIG_6(SWIGTYPE_p_uint8_t.getCPtr(szInput), SWIGTYPE_p_uint32_t.getCPtr(nInputSize)), true);
  }

  public OTPassword(SWIGTYPE_p_void vInput, SWIGTYPE_p_uint32_t nInputSize, int theBlockSize) {
    this(otapiJNI.new_OTPassword__SWIG_7(SWIGTYPE_p_void.getCPtr(vInput), SWIGTYPE_p_uint32_t.getCPtr(nInputSize), theBlockSize), true);
  }

  public OTPassword(SWIGTYPE_p_void vInput, SWIGTYPE_p_uint32_t nInputSize) {
    this(otapiJNI.new_OTPassword__SWIG_8(SWIGTYPE_p_void.getCPtr(vInput), SWIGTYPE_p_uint32_t.getCPtr(nInputSize)), true);
  }

  public final static class BlockSize {
    public final static int DEFAULT_SIZE = otapiJNI.OTPassword_DEFAULT_SIZE_get();
    public final static int LARGER_SIZE = otapiJNI.OTPassword_LARGER_SIZE_get();
  }

}
