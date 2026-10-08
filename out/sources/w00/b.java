package w00;

import CON.p;
import fr.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import mu.r0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p087nuL.b0;
import p087nuL.g0;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u00012\u00020\u00062\u00020\u0007B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R8\u0010\u001c\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lw00/b;", "Loz/b;", "", "", "", "", "Lgy/a;", "Lw00/a;", "Lgy/b;", "permissionProvider", "<init>", "(Lgy/b;)V", "permissions", "Lgy/c;", "t", "(Ljava/util/Map;)Lgy/c;", "Lgy/d;", "permissionType", "d", "(Lgy/d;Ltq/e;)Ljava/lang/Object;", "h", "(Lgy/d;)Lgy/c;", "Lgy/b;", "LnuL/b0;", "e", "LnuL/b0;", "r", "()LnuL/b0;", "contract", "Lmu/b0;", "f", "Lmu/b0;", "isRequestInProgress", "permission_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends oz.b<String[], Map<String, ? extends Boolean>> implements gy.a, w00.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final gy.b permissionProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0<String[], Map<String, Boolean>> contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<Boolean> isRequestInProgress;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f209134e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f209136g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209134e = obj;
            this.f209136g |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final gy.c t(Map<String, Boolean> permissions) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Boolean> entry : permissions.entrySet()) {
            p componentActivity = getComponentActivity();
            if (componentActivity == null) {
                return gy.c.C1774c.f78238a;
            }
            boolean zShouldShowRequestPermissionRationale = componentActivity.shouldShowRequestPermissionRationale(entry.getKey());
            if (entry.getValue().booleanValue()) {
                arrayList.add(gy.c.a.f78236a);
            } else {
                arrayList.add(new gy.c.NotGranted(zShouldShowRequestPermissionRationale));
            }
        }
        if (arrayList.contains(new gy.c.NotGranted(false)) || arrayList.isEmpty()) {
            return new gy.c.NotGranted(false);
        }
        return arrayList.contains(new gy.c.NotGranted(true)) ? new gy.c.NotGranted(true) : gy.c.a.f78236a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gy.a
    public Object d(gy.d dVar, e<? super gy.c> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f209136g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209136g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objS = aVar.f209134e;
        Object objE = uq.b.e();
        int i16 = aVar.f209136g;
        try {
            if (i16 == 0) {
                u.b(objS);
                this.isRequestInProgress.setValue(vq.b.a(true));
                String[] strArrA = this.permissionProvider.a(dVar);
                aVar.f209133d = j.a(dVar);
                aVar.f209136g = 1;
                objS = s(strArrA, aVar);
                if (objS == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(objS);
            }
            gy.c cVarT = t((Map) objS);
            this.isRequestInProgress.setValue(vq.b.a(false));
            return cVarT;
        } catch (Throwable th4) {
            this.isRequestInProgress.setValue(vq.b.a(false));
            throw th4;
        }
    }

    @Override // gy.a
    public gy.c h(gy.d permissionType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : this.permissionProvider.a(permissionType)) {
            p componentActivity = getComponentActivity();
            linkedHashMap.put(str, Boolean.valueOf(componentActivity != null && componentActivity.checkSelfPermission(str) == 0));
        }
        return t(linkedHashMap);
    }

    @Override // oz.b
    public b0<String[], Map<String, ? extends Boolean>> r() {
        return this.contract;
    }

    public b(gy.b bVar) {
        this.permissionProvider = bVar;
        this.contract = new g0();
        this.isRequestInProgress = r0.a(Boolean.FALSE);
    }

    public /* synthetic */ b(gy.b bVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? new c() : bVar);
    }
}
