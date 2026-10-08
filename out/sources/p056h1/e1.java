package p056h1;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p056h1.b1;
import p071kotlin.Metadata;
import r0.j0;
import r0.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lh1/e1;", "Lh1/b1;", "T", "", "<init>", "()V", "", "index", "lane", "span", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "a", "(IIIJ)Lh1/b1;", "Lh1/z0;", "", "Le4/a2;", "b", "(Lh1/z0;IJ)Ljava/util/List;", "Lr0/j0;", "Lr0/j0;", "placeablesCache", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e1<T extends b1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0<List<a2>> placeablesCache = r.c();

    public abstract T a(int index, int lane, int span, long constraints);

    public final List<a2> b(z0 z0Var, int i15, long j15) {
        List<a2> listB = this.placeablesCache.b(i15);
        if (listB != null) {
            return listB;
        }
        List<v0> listU2 = z0Var.u2(i15);
        int size = listU2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i16 = 0; i16 < size; i16++) {
            arrayList.add(listU2.get(i16).o0(j15));
        }
        this.placeablesCache.r(i15, arrayList);
        return arrayList;
    }
}
