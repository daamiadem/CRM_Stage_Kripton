package kripton.kriptonbackcrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kripton.kriptonbackcrm.models.AddressType;
import kripton.kriptonbackcrm.models.Profile;
import kripton.kriptonbackcrm.repos.AdresseRepo;
import kripton.kriptonbackcrm.repos.ProfilRepo;

@Service
public class ProfilServiceImpl implements ProfilService{

	@Autowired
	private ProfilRepo profilrepo ; 
	@Autowired
	private AdresseRepo adressrepo ; 
	

}
