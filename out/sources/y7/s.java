package y7;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f224933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f224934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, List<String>> f224935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f224936g;

    public s(int i15, String str, IOException iOException, Map<String, List<String>> map, j jVar, byte[] bArr) {
        super("Response code: " + i15, iOException, jVar, 2004, 1);
        this.f224933d = i15;
        this.f224934e = str;
        this.f224935f = map;
        this.f224936g = bArr;
    }
}
