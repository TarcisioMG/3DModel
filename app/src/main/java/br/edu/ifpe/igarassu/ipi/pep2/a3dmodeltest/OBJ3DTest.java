package br.edu.ifpe.igarassu.ipi.pep2.a3dmodeltest;

import min3d.core.Object3dContainer;
import min3d.core.RendererActivity;
import min3d.parser.IParser;
import min3d.parser.Parser;
import min3d.vos.Light;

/**
 * Created by allan on 4/14/2018.
 */

public class OBJ3DTest extends RendererActivity {

    private Object3dContainer faceObject3D;

    /** Called when the activity is first created. */
    @Override
    public void initScene()
    {
        //scene.lights().add(new Light());
        //scene.lights().add(new Light());

        Light myLight = new Light();
        myLight.position.setX(150);
        scene.lights().add(myLight);

        IParser myParser = Parser.createParser(Parser.Type.OBJ, getResources(), "br.edu.ifpe.igarassu.ipi.pep2.a3dmodeltest:raw/dice_obj",true);
        myParser.parse();

        faceObject3D = myParser.getParsedObject();
        faceObject3D.position().x = faceObject3D.position().y = faceObject3D.position().z = 0;
        //faceObject3D.scale().x = faceObject3D.scale().y = faceObject3D.scale().z = 0.5f;
// Depending on the model you will need to change the scale
        faceObject3D.scale().x = faceObject3D.scale().y = faceObject3D.scale().z = 0.5f;

        scene.addChild(faceObject3D);

    }

    @Override
    public void updateScene() {
        //faceObject3D.rotation().x += 0.5;
        //faceObject3D.rotation().z += 1;
        faceObject3D.rotation().y += 2.0;
    }
}
