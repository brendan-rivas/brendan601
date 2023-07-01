﻿package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.events.KeyboardEvent;
	import flash.utils.Timer;
	import flash.events.TimerEvent;
	import flash.text.TextField;
	import flash.text.TextFormat;
	
	public class protagonista extends MovieClip {
		private var izq: Boolean = false;
		private var der: Boolean = false;
		private var vel: int = 10 ;
		private var lim_x_der: int  = 510 ;
		private var lim_x_izq: int = 40 ;
		private var lanzar: Timer = new Timer(800, 0);
		static var puntos2: int=0;
        private var textField: TextField;
		
		public function protagonista() {
			// constructor code
			addEventListener( Event.ENTER_FRAME, motor);
			lanzar.addEventListener(TimerEvent.TIMER, lanza_bala);
			lanzar.start();
				}
		
		
		public function motor(e: Event):void{
			if(der){
				if(x<= lim_x_der){
					x+=vel;
					}
				}
				else if(izq){
					if(x>= lim_x_izq){
					x-=vel;
				}
				}
				controles();
				}
			
			
			public function controles(){
				stage.addEventListener(KeyboardEvent.KEY_DOWN, keydown);
				stage.addEventListener(KeyboardEvent.KEY_UP, keyup);
				}
				
				
			public function keydown(e: KeyboardEvent):void{
				switch (e.keyCode){
					case 39:
					der=true;
					break;
					
					case 37:
					izq=true;
					break;
					
						}
						
						
				}
					
			public function keyup(e: KeyboardEvent):void{
				switch (e.keyCode){
					case 39:
					der=false;
					break;
						
					case 37:
					izq=false;
					break;
					
						}
				}
				
				public function lanza_bala(e: TimerEvent){
			//trace("lanza bala");
			
			var bala_nueva = new bala(x,y);
			stage.addChild(bala_nueva);
			puntos2++;
			
			
					
				}
}
}