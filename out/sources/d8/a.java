package d8;

import android.os.Build;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return Build.VERSION.SDK_INT >= 27 ? bArr : o0.p0(c(o0.G(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(o0.G(bArr));
            StringBuilder sb5 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                if (i15 != 0) {
                    sb5.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i15);
                sb5.append("{\"k\":\"");
                sb5.append(d(jSONObject2.getString("k")));
                sb5.append("\",\"kid\":\"");
                sb5.append(d(jSONObject2.getString("kid")));
                sb5.append("\",\"kty\":\"");
                sb5.append(jSONObject2.getString("kty"));
                sb5.append("\"}");
            }
            sb5.append("]}");
            return o0.p0(sb5.toString());
        } catch (JSONException e15) {
            w7.t.d("ClearKeyUtil", "Failed to adjust response data: " + o0.G(bArr), e15);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
