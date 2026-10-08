package no1;

import dx.i;
import iy.c0;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lno1/a;", "", "Lgz/b$a$a;", "Lo04/b$b;", "Lay/a;", "baseUrlProvider", "<init>", "(Lay/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lay/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ay.a baseUrlProvider;

    public a(ay.a aVar) {
        this.baseUrlProvider = aVar;
    }

    public Object a(gz.b.a.C1792a c1792a, e<? super i<? extends dx.b, o04.b.Uploader>> eVar) {
        return new i.Right(new o04.b.Uploader(this.baseUrlProvider.getBaseUrl() + "file/mobile/api/files", c0.g("eyJraWQiOiJUTjZuZEtrTFEza3ozV1ZoWU9seWxzOUtObEl5OXJEMFFEVEg4c2dVanhzIiwiY3R5IjoiSldUIiwiZW5jIjoiQTI1NkdDTSIsImFsZyI6ImRpciJ9..pC4A8QGqGaMLVVW6.OBIkw06HobfDf8ah_jM_EAdGF7Uy8LE4SFUrWaQ3BFYNl8ZTbY_gPMbWVBZjsXv8e0SvYXd9D_BR1rPL2GgoEw0tcNslTBz6B7dxXqEN-RoeKzVXczoGbOfbGUFvMpO8v7P2KDUNLd4dVR9Arfi3qJ0s9dhdBOuYOW2ln_ckTsg6LQsHuc28K2zt_6_awpH9mOYDAlORFEMt9vltZStuWHdIyMlTShoNUojhrAuBiMndms4g9zVf8f_YZ4rZ_8yqY4wz5btec1ySIxeVyWPgnK66s2XLbIzWQbLgrISPmtwQtoIBmuZt7xHFmgFfr9tFSUKMlD8t3JoORhOpFfNb8hqG1IAVRxK5vl3OlNtOABP27fCfEqTmtO_NpseRyZDmHtgfTFCC8-wLUxvql7fKOsvULU2f8_dmceTku5POrqU_4z0jH3m9ZKC9uOtQtQ9Kf6O37DzXwFPkS4Utje6dcmfpz_s58c0b6hcYuFarRcJfNXciu8yhSFi853N2leHNs_eawbj-13GUMqteLjZyfkccIvWTf0ojQ-rtajwqYOMaR_CmDkC5qe3VbGTb6qazVQc5yAVA7Zm4YsoIAbKFsDr_AxCk-Q_K0g1i7a-7K6PP6Ce4X-5zVfoADQ69a9N-Lvm368ffwE9T_XD6RnHiFUyU.YNIaPaD84OpyB_hJNpwe2Q"), new fz.b.OffsetDateTime(OffsetDateTime.now().plusMinutes(30L)), ry.a.b(c0.g("6YWKjyGm83Sh8sQN7Opcjh+B0ePV6TIFq+LH7gW2LDk=")), ry.a.b(c0.g("MIIDuzCCAqOgAwIBAgIDBETAMA0GCSqGSIb3DQEBBQUAMH4xCzAJBgNVBAYTAlBMMSIwIAYDVQQKExlVbml6ZXRvIFRlY2hub2xvZ2llcyBTLkEuMScwJQYDVQQLEx5DZXJ0dW0gQ2VydGlmaWNhdGlvbiBBdXRob3JpdHkxIjAgBgNVBAMTGUNlcnR1bSBUcnVzdGVkIE5ldHdvcmsgQ0EwHhcNMDgxMDIyMTIwNzM3WhcNMjkxMjMxMTIwNzM3WjB+MQswCQYDVQQGEwJQTDEiMCAGA1UEChMZVW5pemV0byBUZWNobm9sb2dpZXMgUy5BLjEnMCUGA1UECxMeQ2VydHVtIENlcnRpZmljYXRpb24gQXV0aG9yaXR5MSIwIAYDVQQDExlDZXJ0dW0gVHJ1c3RlZCBOZXR3b3JrIENBMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4/t9o3K6wvDJFIf1awFO4W5AB7ptJ11/91sts1rHUV+rpDKmYYe2bg+G0jACl/jXaVehGDldamR5xgFZrDwxSjh80gTSSyjoIF87B6LMTXPb865Px1bVWqeWifrzq2jUI4ZZJ88JJ7ysbnKDHDBy3+Ci6dLhdHUZvSqeexVUBBvXQzmtVSjF4hq79MDkrjhJM8x2hZ85RdKknvISjFH4fOQtf/WsX+sWn7Et0brMkUJ3TCXJkDhv2/DM+44el1k+1WBO5gUo7Ul5E0u6SNsv+XLTOcr+H9g0cvW0QM8xAcPs3hEtF10fuFDRXhmnad4HMyjKUJX5p1TLVIZQRan5SQIDAQABo0IwQDAPBgNVHRMBAf8EBTADAQH/MB0GA1UdDgQWBBQIds3LB/8k9sXN7buQvOKEN0Z19zAOBgNVHQ8BAf8EBAMCAQYwDQYJKoZIhvcNAQEFBQADggEBAKaorSLOAT2mo/9i0Eidi15ysHhE49wcrwn9I0j6vSrEuVUEtRCjjSfeC4Jj0O7eDDd5QVsisrCaQVymcODU0HfLI9MA4GxWL+FpDQ3Zqr8hgVDZBqWo/5U30Kr+4rP1mS1FhIrlQgnXdAIv94nYmem8J9RHjboNRhx3zxSkHLmkMcScKHQDNP8zGSal6Q10tz6XxnboJ5ajZt3hrvJBW8qYVoNzcOSGGtIxQbovvi0TWnZvTuhOgQ4/WwMioBK+ZlgRSssDxLQqKi2WF+A5VLxI03YnnZotBqbJ7DnSq9ufmgsnAjUpsUCV5/nonFWIGUbWtzT1fs45mtk48VH3Tyw=")), null));
    }
}
