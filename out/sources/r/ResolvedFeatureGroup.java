package r;

import fr.k;
import java.util.Set;
import o.e1;
import o.u1;
import oq.p;
import p071kotlin.Metadata;
import v.m0;

/* JADX INFO: renamed from: r.b, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lr/b;", "", "", "Lq/b;", "features", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResolvedFeatureGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<q.b> features;

    /* JADX INFO: renamed from: r.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr/b$a;", "", "<init>", "()V", "Lo/u1;", "Lv/m0;", "cameraInfoInternal", "Lt/c;", "resolver", "Lr/b;", "b", "(Lo/u1;Lv/m0;Lt/c;)Lr/b;", "", "TAG", "Ljava/lang/String;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ ResolvedFeatureGroup c(Companion companion, u1 u1Var, m0 m0Var, t.c cVar, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                cVar = new t.a(m0Var);
            }
            return companion.b(u1Var, m0Var, cVar);
        }

        public final ResolvedFeatureGroup a(u1 u1Var, m0 m0Var) {
            return c(this, u1Var, m0Var, null, 2, null);
        }

        public final ResolvedFeatureGroup b(u1 u1Var, m0 m0Var, t.c cVar) {
            e1.a("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + u1Var + ", lensFacing = " + m0Var.n());
            if (u1Var.j().isEmpty() && u1Var.h().isEmpty()) {
                return null;
            }
            t.b bVarA = cVar.a(u1Var);
            if (bVarA instanceof t.b.Supported) {
                ResolvedFeatureGroup resolvedFeatureGroupA = ((t.b.Supported) bVarA).getResolvedFeatureGroup();
                e1.a("ResolvedFeatureGroup", "resolvedFeatureGroup = " + resolvedFeatureGroupA);
                return resolvedFeatureGroupA;
            }
            if (bVarA instanceof t.b.C4813b) {
                throw new IllegalArgumentException("Feature group is not supported");
            }
            if (bVarA instanceof t.b.UnsupportedUseCase) {
                throw new IllegalArgumentException(((t.b.UnsupportedUseCase) bVarA).getUnsupportedUseCase() + " is not supported");
            }
            if (!(bVarA instanceof t.b.UseCaseMissing)) {
                throw new p();
            }
            StringBuilder sb5 = new StringBuilder();
            t.b.UseCaseMissing dVar = (t.b.UseCaseMissing) bVarA;
            sb5.append(dVar.getRequiredUseCases());
            sb5.append(" must be added for ");
            sb5.append(dVar.getFeatureRequiring());
            throw new IllegalArgumentException(sb5.toString());
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResolvedFeatureGroup(Set<? extends q.b> set) {
        this.features = set;
    }

    public static final ResolvedFeatureGroup b(u1 u1Var, m0 m0Var) {
        return INSTANCE.a(u1Var, m0Var);
    }

    public final Set<q.b> a() {
        return this.features;
    }

    public String toString() {
        return "ResolvedFeatureGroup(features=" + this.features + ')';
    }
}
