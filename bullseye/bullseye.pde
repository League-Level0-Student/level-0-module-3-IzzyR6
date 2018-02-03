void setup(){
  size(500,500);
  noFill();
}
void draw(){
  for(int i = 10; i > 0; i--) {
    
  ellipse(250,250,i*25,i*25);
  
    if(i%2==0){
 fill(255,255,255);
   ellipse(250,250,i*25,i*25);
    }
    else{
      fill(255,3,3);
      ellipse(250,250,i*25,i*25);
    }
  }
}
  