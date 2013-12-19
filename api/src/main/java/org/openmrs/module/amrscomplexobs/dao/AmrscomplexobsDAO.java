
/**
 * 
 */
package org.openmrs.module.amrscomplexobs.dao;

import java.util.List;

import org.openmrs.Field;
import org.openmrs.module.amrscomplexobs.model.Amrscomplexobs;
import org.openmrs.module.amrscomplexobs.model.AmrsPersonType;

public interface AmrscomplexobsDAO {

	public Amrscomplexobs saveAmrscomplexobs(Amrscomplexobs amrscomplexobs);
	public List<Amrscomplexobs> getAmrscomplexobs();
	public Amrscomplexobs getAmrscomplexobsByUuid(String uuid);
    public List<Field> getComplexConceptFieldUuids() ;
    public AmrsPersonType saveAmrsPersonType(AmrsPersonType amrspersontype);
    public List<AmrsPersonType> getAmrsPersonType();
    public AmrsPersonType getAmrsPersonTypeByUuid(String uuid);



}