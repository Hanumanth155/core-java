class TorchExecutor{

   public static void main(String[] args){
   
   boolean torch= Torch.switchTorch();
   
   System.out.println("The Torch is currently turned On : "+ torch);
   }

}