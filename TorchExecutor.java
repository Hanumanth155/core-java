class TorchExecutor {

    public static void main(String[] args) {

        boolean on = Torch.switchTorch();
        System.out.println("The Torch is currently turned On : " + on);

        Torch.increaseBrightness();
        Torch.increaseBrightness();
        Torch.increaseBrightness();
        Torch.increaseBrightness();
        Torch.increaseBrightness();

        Torch.decreaseBrightness();
        Torch.decreaseBrightness();
        Torch.decreaseBrightness();
        Torch.decreaseBrightness();
        Torch.decreaseBrightness();

        boolean off = Torch.switchTorch();
        System.out.println("The Torch is currently turned On : " + off);
    }
}
