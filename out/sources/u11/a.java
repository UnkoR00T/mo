package u11;

import androidx.compose.ui.graphics.Color;
import fr.t;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import p076m2.r;
import t11.g;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lu11/a;", "Lxw/f;", "Lu11/a$a;", "Lt11/g$a;", "<init>", "()V", "params", "c", "(Lu11/a$a;)Lt11/g$a;", "a", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.a> {

    /* JADX INFO: renamed from: u11.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lu11/a$a;", "", "Lt11/f;", "state", "<init>", "(Lt11/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt11/f;", "()Lt11/f;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final t11.f state;

        public Params(t11.f fVar) {
            this.state = fVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final t11.f getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.state, ((Params) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        t11.f state = params.getState();
        if (t.c(state, t11.f.b.f186963a)) {
            return g.a.C4856a.f186964a;
        }
        if (!(state instanceof t11.f.Initialized)) {
            throw new p();
        }
        t11.f.Initialized initialized = (t11.f.Initialized) state;
        Label title = initialized.getModel().getTitle();
        er.p<r, Integer, Color> pVarB = initialized.getModel().b();
        return new g.a.Initialized(new h50.a(initialized.getModel().getIcon(), pVarB, title, initialized.getModel().getPrimaryKeyValue().d(), initialized.getModel().getPrimaryKeyValue().c(), initialized.getModel().getSecondaryKeyValue().d(), initialized.getModel().getSecondaryKeyValue().c(), initialized.getModel().getPrimaryButton(), null, null, c70.a.f23835a.a().r0(), initialized.getModel().getPrimaryButton().h()));
    }
}
