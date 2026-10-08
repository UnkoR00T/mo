package wd;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import vd.p;

/* JADX INFO: loaded from: classes3.dex */
public class j extends k<JSONObject> {
    public j(int i15, String str, JSONObject jSONObject, p.b<JSONObject> bVar, p.a aVar) {
        super(i15, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    @Override // vd.n
    protected p<JSONObject> R(vd.k kVar) {
        try {
            return p.c(new JSONObject(new String(kVar.f206177b, e.f(kVar.f206178c, "utf-8"))), e.e(kVar));
        } catch (UnsupportedEncodingException e15) {
            return p.a(new vd.m(e15));
        } catch (JSONException e16) {
            return p.a(new vd.m(e16));
        }
    }
}
