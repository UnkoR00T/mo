package d8;

import ak.p0;
import android.net.Uri;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y7.f.a f40237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f40239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f40240d;

    public g0(String str, boolean z15, y7.f.a aVar) {
        zj.p.d((z15 && TextUtils.isEmpty(str)) ? false : true);
        this.f40237a = aVar;
        this.f40238b = str;
        this.f40239c = z15;
        this.f40240d = new HashMap();
    }

    @Override // d8.j0
    public j0.b a(UUID uuid, a0.a aVar) throws k0 {
        String str;
        String strB = aVar.b();
        if (this.f40239c || TextUtils.isEmpty(strB)) {
            strB = this.f40238b;
        }
        if (TextUtils.isEmpty(strB)) {
            y7.j.b bVar = new y7.j.b();
            Uri uri = Uri.EMPTY;
            throw new k0(bVar.h(uri).a(), uri, p0.m(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = t7.f.f188174f;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = t7.f.f188172d.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f40240d) {
            map.putAll(this.f40240d);
        }
        return x.a(this.f40237a.a(), strB, aVar.a(), map);
    }

    @Override // d8.j0
    public j0.b b(UUID uuid, a0.d dVar) {
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArrB = ek.b.b("{\"signedRequest\":\"".getBytes(charset), dVar.a(), "\"}".getBytes(charset));
        return x.a(this.f40237a.a(), dVar.b(), bArrB, p0.n("Content-Type", dk.e.D0.toString(), "Content-Length", String.valueOf(bArrB.length)));
    }

    public void c(String str, String str2) {
        zj.p.q(str);
        zj.p.q(str2);
        synchronized (this.f40240d) {
            this.f40240d.put(str, str2);
        }
    }
}
