package eda2;

public class Financiacion {

	/*
	 * Solo se puede financiar el 75 % del valor del auto --> El resto debe tener disponible el cliente
	 * Aplica autos desde 2018 a 2020
	 * 
	 *   https://www.bbva.com.ar/tablas/tasaprestprend.pdf
	 * 
	 * 12 meses --> CFTEA --> 66.42
	 * 24 meses --> CFTEA --> 66.42
	 * 36 meses --> CFTEA --> 68.36
	 * 48 meses --> CFTEA --> 68.36
	 * 60 meses --> CFTEA --> 70.32
	 */

		
		private final double CFTEA_12 = 0.6642;
		private final double CFTEA_24 = 0.6642;
		private final double CFTEA_36 = 0.6836;
		private final double CFTEA_48 = 0.6836;
		private final double CFTEA_60 = 0.7032;
		
		private double montoTotalMasRecargo;
		private double montoTotal;
		private double montoCuotas;
		private int meses;
		private int años; 
		
		public Financiacion(double montoTotal, int meses) {
			super();
			this.montoTotal = montoTotal;
			this.meses = meses;
			años = meses / 12;
			
			if(meses == 12) {
				this.montoTotalMasRecargo = this.montoTotal + ( this.montoTotal * CFTEA_12) ;
				this.montoCuotas = this.montoTotalMasRecargo / meses;
			}else {
				if(meses == 24) {
					this.montoTotalMasRecargo = this.montoTotal + ( this.montoTotal * CFTEA_24) ;
					this.montoCuotas = this.montoTotalMasRecargo / meses;
				}else {
					if(meses == 36) {
						this.montoTotalMasRecargo = this.montoTotal + ( this.montoTotal * CFTEA_36) ;
						this.montoCuotas = this.montoTotalMasRecargo / meses;
					}else {
						if(meses == 48) {
							this.montoTotalMasRecargo = this.montoTotal + ( this.montoTotal * CFTEA_48) ;
							this.montoCuotas = this.montoTotalMasRecargo / meses;
						}else {
							if(meses == 60) {
								this.montoTotalMasRecargo = this.montoTotal + ( this.montoTotal * CFTEA_60) ;
								this.montoCuotas = this.montoTotalMasRecargo / meses;
							}
						}
					}
				}
			}
		
		
		}

		public double getMontoCuotas() {
			return montoCuotas;
		}

		public double getMontoTotalMasRecargo() {
			return montoTotalMasRecargo;
		}

		public int getAños() {
			return años;
		}
}
