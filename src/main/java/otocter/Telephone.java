package otocter;

public class Telephone {
	int cpu;
	int size;
	int cap;
	
	

	

	



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telephone other = (Telephone) obj;
		if (cap != other.cap)
			return false;
		if (cpu != other.cpu)
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
}
