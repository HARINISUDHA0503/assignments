package com.Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
	public class DetailsService {
	    private static List<Details> info=new ArrayList<>();
	    static
	    {
	        info.add(new Details(620021,"Tamilnadu","Trichy","INDIA"));
	        info.add(new Details(603210,"Tamiladu","chennai","INDIA"));
	        info.add(new Details(345675,"Karnataka","Bangalore","INDIA"));
	    }
	    public Details findOne(int code)
	    {
	        Predicate<? super Details> predicate=u->u.getZipcode().equals(code);
	        return info.stream().filter(predicate).findFirst().orElse(null);
	    }
	}
