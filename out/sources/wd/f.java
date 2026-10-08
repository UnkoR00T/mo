package wd;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f212202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<vd.g> f212203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f212204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f212205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f212206e;

    public f(int i15, List<vd.g> list) {
        this(i15, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f212205d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f212206e != null) {
            return new ByteArrayInputStream(this.f212206e);
        }
        return null;
    }

    public final int b() {
        return this.f212204c;
    }

    public final List<vd.g> c() {
        return Collections.unmodifiableList(this.f212203b);
    }

    public final int d() {
        return this.f212202a;
    }

    public f(int i15, List<vd.g> list, int i16, InputStream inputStream) {
        this.f212202a = i15;
        this.f212203b = list;
        this.f212204c = i16;
        this.f212205d = inputStream;
        this.f212206e = null;
    }
}
