precision mediump float;

uniform sampler2D u_DrivingLicenceDynamicLayer;

varying vec2 v_TextureCoordinates;
varying vec2 v_AccelerometerCoordinates;

void main() {
    vec4 drivingLicenceDynamicTexture = texture2D(u_DrivingLicenceDynamicLayer, v_TextureCoordinates);

    vec4 drivingLicenceDynamicTextureColored = vec4(drivingLicenceDynamicTexture.r+abs((v_AccelerometerCoordinates.x*v_AccelerometerCoordinates.y)/2.0),
    drivingLicenceDynamicTexture.g+abs((v_AccelerometerCoordinates.x*v_AccelerometerCoordinates.y)/2.0),
    drivingLicenceDynamicTexture.b+abs((v_AccelerometerCoordinates.x*v_AccelerometerCoordinates.y)/2.0),
    drivingLicenceDynamicTexture.a-abs((v_AccelerometerCoordinates.x*v_AccelerometerCoordinates.y)/4.0));
    
    gl_FragColor = drivingLicenceDynamicTextureColored;

}
