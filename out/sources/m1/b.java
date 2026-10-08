package m1;

import b1.i;
import p071kotlin.Metadata;
import r0.i1;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lm1/b;", "Lb1/i;", "T", "", "<init>", "()V", "", "b", "()Z", "interaction", "Loq/i0;", "a", "(Lb1/i;)V", "c", "Ljava/lang/Object;", "setOrValue", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b<T extends b1.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object setOrValue;

    public final void a(T interaction) {
        Object obj = this.setOrValue;
        if (obj == null) {
            this.setOrValue = interaction;
        } else if (obj instanceof u0) {
            ((u0) obj).i(interaction);
        } else {
            if (fr.t.c(obj, interaction)) {
                return;
            }
            this.setOrValue = i1.c((b1.i) obj, interaction);
        }
    }

    public final boolean b() {
        return this.setOrValue != null;
    }

    public final void c(T interaction) {
        Object obj = this.setOrValue;
        if (fr.t.c(obj, interaction)) {
            this.setOrValue = null;
            return;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            u0Var.z(interaction);
            int i15 = u0Var.get_size();
            if (i15 == 0) {
                this.setOrValue = null;
            } else {
                if (i15 != 1) {
                    return;
                }
                this.setOrValue = u0Var.b();
            }
        }
    }
}
