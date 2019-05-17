package com.rma.brownbag;

import java.util.List;
import java.util.logging.Logger;

/**
 * Company: Resource Management Associates
 *
 * @author <a href="mailto:adam@rmanet.com">Adam Korynta</a>
 * @since 05-16-2019
 */
class Iterate
{
	private final List<String> _values;

	Iterate(List<String> values){
		_values = values;
	}

	void printFirst(){
		Logger.getLogger(Iterate.class.getName()).info(_values.get(0));
	}
}
