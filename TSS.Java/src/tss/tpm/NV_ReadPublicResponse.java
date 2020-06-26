package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>

/** This command is used to read the public area and Name of an NV Index. The public area
 *  of an Index is not privacy-sensitive and no authorization is required to read this data.
 */
public class NV_ReadPublicResponse extends TpmStructure
{
    /** The public area of the NV Index  */
    public TPMS_NV_PUBLIC nvPublic;
    
    /** The Name of the nvIndex  */
    public byte[] nvName;
    
    public NV_ReadPublicResponse() {}
    
    /** TpmMarshaller method  */
    @Override
    public void toTpm(TpmBuffer buf)
    {
        buf.writeSizedObj(nvPublic);
        buf.writeSizedByteBuf(nvName);
    }
    
    /** TpmMarshaller method  */
    @Override
    public void initFromTpm(TpmBuffer buf)
    {
        nvPublic = buf.createSizedObj(TPMS_NV_PUBLIC.class);
        nvName = buf.readSizedByteBuf();
    }
    
    /** @deprecated Use {@link #toBytes()} instead  */
    public byte[] toTpm () { return toBytes(); }
    
    /** Static marshaling helper  */
    public static NV_ReadPublicResponse fromBytes (byte[] byteBuf) 
    {
        return new TpmBuffer(byteBuf).createObj(NV_ReadPublicResponse.class);
    }
    
    /** @deprecated Use {@link #fromBytes()} instead  */
    public static NV_ReadPublicResponse fromTpm (byte[] byteBuf)  { return fromBytes(byteBuf); }
    
    /** Static marshaling helper  */
    public static NV_ReadPublicResponse fromTpm (TpmBuffer buf) 
    {
        return buf.createObj(NV_ReadPublicResponse.class);
    }
    
    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPM2_NV_ReadPublic_RESPONSE");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }
    
    @Override
    public void toStringInternal(TpmStructurePrinter _p, int d)
    {
        _p.add(d, "TPMS_NV_PUBLIC", "nvPublic", nvPublic);
        _p.add(d, "byte", "nvName", nvName);
    }
}

//<<<
