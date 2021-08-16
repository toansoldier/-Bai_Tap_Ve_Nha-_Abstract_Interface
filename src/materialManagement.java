public class materialManagement {

    public static Material[] addMaterial(Material[] materials, Material product) {

        Material[] newMaterials = new Material[materials.length + 1];
        for (int i = 0; i < materials.length; i++) {
            newMaterials[i] = materials[i];
        }

        newMaterials[newMaterials.length - 1] = product;
        return newMaterials;
    }

    public static void editMaterial(Material[] materials, String id, Material product) {
        for (int i = 0; i < materials.length; i++) {
            if (materials[i].getId().equals(id)) {
                materials[i] = product;
            }
        }
    }

    public static Material[] deleteMaterial(Material[] materials, String id) {

        Material[] newMaterial = new Material[materials.length - 1];
        int count = 0;

        for (int i = 0; i < materials.length; i++) {
            if (materials[i].getId().equals(id)) {
                continue;
            } else {
                newMaterial[count++] = materials[i];
            }
        }

        return newMaterial;
    }
}