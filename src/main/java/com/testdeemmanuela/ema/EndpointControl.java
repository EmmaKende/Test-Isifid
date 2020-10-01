package com.testdeemmanuela.ema;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping("/Endpoint")

public class EndpointControl {
	
	public int Fibonacci(int nombre) {
		int u,v,w;
		 u=1;
		 v=1;
		 w=1;
		 	if(nombre==0) u=1;
		 	else { 
		 		if(nombre==1) u=1;
		 		else {
		 			for(int i=2 ;i<=nombre ;i++){
						 u=v+w;
						 w=v;
						 v=u;
		 			}
		 		}
		 	}
		 return u;		
	}
	
	public int Factorielle(int x) {
		
		if(x==0) return 1 ;
		return x*Factorielle(x-1) ;
	}

	@GetMapping(value = "/{nombre}")
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	
    public String endpoint(@PathVariable("nombre") int nombre) {
		
		if(nombre<0) { 
			return " HTTP "+HttpStatus.BAD_REQUEST.value();
		}
		
		// renvoie fibonacci jusqu'au nombre pour un nombre impair
		else if(nombre%2==1) {
	
				return "la suite Fibonacci jusqu'à "+nombre+" est : "+Fibonacci(nombre);
		}
		
		//renvoie le nombre pour un nombre pair et supérieur à 50
		else if((nombre%2==0)&&(nombre>50)) {
			return "le nombre entré est : " +nombre;
		}
		
		//renvoie la factorielle du nombre si il est pair et inférieur à 51
		else if( (nombre%2==0)&&(nombre<51)){

			  return " "+nombre+"! = "+Factorielle(nombre);
		}
		else  return " ";	
	}
} 
	
	
