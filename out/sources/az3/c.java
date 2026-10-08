package az3;

import fr.t;
import hz.g;
import hz.i;
import iy.c0;
import java.util.LinkedHashMap;
import java.util.Map;
import lr.m;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Laz3/c;", "Lxy3/b;", "Lmx/c;", "labelProvider", "Lyw/b;", "accessibilityTalkBackManager", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lyw/b;Lhz/i;)V", "Lxy3/b$a;", "params", "", "Lwy3/a;", "", "Lpl/gov/coi/mobywatel/segment/setpassword/contract/model/PasswordRequirements;", "d", "(Lxy3/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lyw/b;", "c", "Lhz/i;", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements xy3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15537a;

        static {
            int[] iArr = new int[wy3.a.values().length];
            try {
                iArr[wy3.a.MIN_LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wy3.a.SPECIAL_MARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wy3.a.UPPER_CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wy3.a.LOWER_CASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[wy3.a.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f15537a = iArr;
        }
    }

    public c(mx.c cVar, yw.b bVar, i iVar) {
        this.labelProvider = cVar;
        this.accessibilityTalkBackManager = bVar;
        this.validatorTextFactory = iVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(xy3.b.Params params, e<? super Map<wy3.a, Boolean>> eVar) {
        boolean zC;
        wq.a<wy3.a> aVarE = wy3.a.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(aVarE, 10)), 16));
        for (wy3.a aVar : aVarE) {
            int i15 = a.f15537a[aVar.ordinal()];
            if (i15 == 1) {
                zC = t.c(this.validatorTextFactory.a().O(8, this.labelProvider.e(uy3.a.f202345o, vq.b.e(8))).a(c0.e(params.getPassword())), g.b.f86853b);
            } else if (i15 == 2) {
                zC = t.c(this.validatorTextFactory.a().D(this.labelProvider.c(uy3.a.f202343m)).a(c0.e(params.getPassword())), g.b.f86853b);
            } else if (i15 == 3) {
                zC = t.c(this.validatorTextFactory.a().E(this.labelProvider.c(uy3.a.f202344n)).a(c0.e(params.getPassword())), g.b.f86853b);
            } else if (i15 == 4) {
                zC = t.c(this.validatorTextFactory.a().x(this.labelProvider.c(uy3.a.f202342l)).a(c0.e(params.getPassword())), g.b.f86853b);
            } else {
                if (i15 != 5) {
                    throw new p();
                }
                zC = t.c(this.validatorTextFactory.a().R(this.labelProvider.c(uy3.a.f202341k)).a(c0.e(params.getPassword())), g.b.f86853b);
            }
            linkedHashMap.put(aVar, vq.b.a(zC));
        }
        String validPasswordAccessibilityMessage = params.getValidPasswordAccessibilityMessage();
        if (validPasswordAccessibilityMessage != null && wy3.b.a(linkedHashMap)) {
            this.accessibilityTalkBackManager.a(validPasswordAccessibilityMessage);
        }
        return linkedHashMap;
    }
}
