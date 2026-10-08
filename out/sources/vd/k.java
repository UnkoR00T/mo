package vd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f206176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f206177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f206178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f206179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f206180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f206181f;

    @Deprecated
    public k(int i15, byte[] bArr, Map<String, String> map, boolean z15, long j15) {
        this(i15, bArr, map, a(map), z15, j15);
    }

    private static List<g> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static Map<String, String> b(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }

    public k(int i15, byte[] bArr, boolean z15, long j15, List<g> list) {
        this(i15, bArr, b(list), list, z15, j15);
    }

    @Deprecated
    public k(byte[] bArr, Map<String, String> map) {
        this(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, bArr, map, false, 0L);
    }

    private k(int i15, byte[] bArr, Map<String, String> map, List<g> list, boolean z15, long j15) {
        this.f206176a = i15;
        this.f206177b = bArr;
        this.f206178c = map;
        if (list == null) {
            this.f206179d = null;
        } else {
            this.f206179d = Collections.unmodifiableList(list);
        }
        this.f206180e = z15;
        this.f206181f = j15;
    }
}
