package k0;

import b0.s;
import java.util.List;
import v.f2;
import v.p1;
import v.w3;
import v.x3;
import v.z2;

/* JADX INFO: loaded from: classes.dex */
public class i implements w3<g>, f2, s {
    static final p1.a<List<x3.b>> S = p1.a.a("camerax.core.streamSharing.captureTypes", List.class);
    private final z2 R;

    i(z2 z2Var) {
        this.R = z2Var;
    }

    @Override // v.h3
    /* JADX INFO: renamed from: a */
    public p1 getConfig() {
        return this.R;
    }

    public List<x3.b> i0() {
        return (List) d(S);
    }
}
