package st;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class v extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vr.e f184134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<vr.m1> f184135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Collection<t0> f184136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(vr.e eVar, List<? extends vr.m1> list, Collection<t0> collection, rt.n nVar) {
        super(nVar);
        if (eVar == null) {
            I(0);
        }
        if (list == null) {
            I(1);
        }
        if (collection == null) {
            I(2);
        }
        if (nVar == null) {
            I(3);
        }
        this.f184134d = eVar;
        this.f184135e = Collections.unmodifiableList(new ArrayList(list));
        this.f184136f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void I(int i15) {
        String str = (i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) ? 2 : 3];
        switch (i15) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i15 == 4) {
            objArr[1] = "getParameters";
        } else if (i15 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i15 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i15 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i15 != 4 && i15 != 5 && i15 != 6 && i15 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i15 != 4 && i15 != 5 && i15 != 6 && i15 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // st.w, st.x1
    /* JADX INFO: renamed from: J */
    public vr.e c() {
        vr.e eVar = this.f184134d;
        if (eVar == null) {
            I(5);
        }
        return eVar;
    }

    @Override // st.x1
    public boolean d() {
        return true;
    }

    @Override // st.x1
    public List<vr.m1> getParameters() {
        List<vr.m1> list = this.f184135e;
        if (list == null) {
            I(4);
        }
        return list;
    }

    @Override // st.q
    protected Collection<t0> r() {
        Collection<t0> collection = this.f184136f;
        if (collection == null) {
            I(6);
        }
        return collection;
    }

    public String toString() {
        return dt.i.m(this.f184134d).a();
    }

    @Override // st.q
    protected vr.k1 w() {
        vr.k1.a aVar = vr.k1.a.f208057a;
        if (aVar == null) {
            I(7);
        }
        return aVar;
    }
}
