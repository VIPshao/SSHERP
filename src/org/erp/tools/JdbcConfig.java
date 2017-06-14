package org.erp.tools;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name="jdbc-config" )
public class JdbcConfig {
	
	private Set<Config> configs ;

	@XmlElement( name = "config" )
	public Set<Config> getConfigs() {
		return configs;
	}

	public void setConfigs(Set<Config> configs) {
		this.configs = configs;
	}
	
	public Config getUseConfig(){
		
		Config config = null ;
		
		if( this.configs != null && this.configs.size() > 0 ){
			for( Config c : this.configs ){
				if( c != null && c.isUse() ){
					config = c ;
					break ;
				}
			}
		}
		
		return config ;
	}

}
