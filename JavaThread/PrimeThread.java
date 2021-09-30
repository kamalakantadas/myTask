class PrimeThread extends Thread {
          long minPrime;
          PrimeThread(long minPrime) {
              this.minPrime = minPrime;
          }

          public void run() {
			  System.out.println("Running Number "+minPrime);
              // compute primes larger than minPrime
              //&nbsp;&nbsp;&nbsp;
          }
          public static void main(String[] args){
			  PrimeThread p = new PrimeThread(143);
      p.start();
			  }
      }