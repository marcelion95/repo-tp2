package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.entity.Image;
import ar.edu.unju.fi.service.ICommonService;

@Service
public class CommonServiceImp implements ICommonService{
    
    @Autowired
    // ImageList listaImagenes;

    @Override
    public List<Image> getImagenes() {
        return null;
        // return listaImagenes.getImagenes();
    }
}
