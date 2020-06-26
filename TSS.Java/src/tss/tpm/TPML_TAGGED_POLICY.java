package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>

/** This list is used to report the authorization policy values for permanent handles.
 *  This is list may be generated by TPM2_GetCapabiltiy(). A permanent handle that cannot
 *  have a policy is not included in the list.
 */
public class TPML_TAGGED_POLICY extends TpmStructure implements TPMU_CAPABILITIES
{
    /** Array of tagged policies  */
    public TPMS_TAGGED_POLICY[] policies;
    
    public TPML_TAGGED_POLICY() {}
    
    /** @param _policies Array of tagged policies  */
    public TPML_TAGGED_POLICY(TPMS_TAGGED_POLICY[] _policies) { policies = _policies; }
    
    /** TpmUnion method  */
    public TPM_CAP GetUnionSelector() { return TPM_CAP.AUTH_POLICIES; }
    
    /** TpmMarshaller method  */
    @Override
    public void toTpm(TpmBuffer buf) { buf.writeObjArr(policies); }
    
    /** TpmMarshaller method  */
    @Override
    public void initFromTpm(TpmBuffer buf) { policies = buf.readObjArr(TPMS_TAGGED_POLICY.class); }
    
    /** @deprecated Use {@link #toBytes()} instead  */
    public byte[] toTpm () { return toBytes(); }
    
    /** Static marshaling helper  */
    public static TPML_TAGGED_POLICY fromBytes (byte[] byteBuf) 
    {
        return new TpmBuffer(byteBuf).createObj(TPML_TAGGED_POLICY.class);
    }
    
    /** @deprecated Use {@link #fromBytes()} instead  */
    public static TPML_TAGGED_POLICY fromTpm (byte[] byteBuf)  { return fromBytes(byteBuf); }
    
    /** Static marshaling helper  */
    public static TPML_TAGGED_POLICY fromTpm (TpmBuffer buf) 
    {
        return buf.createObj(TPML_TAGGED_POLICY.class);
    }
    
    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPML_TAGGED_POLICY");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }
    
    @Override
    public void toStringInternal(TpmStructurePrinter _p, int d)
    {
        _p.add(d, "TPMS_TAGGED_POLICY", "policies", policies);
    }
}

//<<<
