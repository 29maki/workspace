package code11_14;

public class KyotoCleaningShop implements CleaningService {
	String ownerName;
	String address;
	String phone;

	@Override
	public Shirt washShirt(Shirt s) {
		return s;
	}

	@Override
	public Towl washTowl(Towl t) {
		return t;
	}

	@Override
	public Coat washCoat(Coat c) {
		return c;
	}

}
