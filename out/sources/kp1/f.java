package kp1;

import d30.BadgeData;
import i30.ButtonIconData;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkp1/f;", "Lxw/f;", "Lkp1/f$a;", "Lkp1/j$a;", "<init>", "()V", "", "value", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Ld30/a;", "Ld40/b$b;", "h", "(ILmx/a;)Ld30/a;", "Li30/a;", "e", "params", "i", "(Lkp1/f$a;)Lkp1/j$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<a, j.Data> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkp1/f$a;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f112146a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -600289973;
        }

        public String toString() {
            return "Params";
        }
    }

    private final BadgeData<ButtonIconData> e(int value, Label label) {
        return new BadgeData<>(value, new ButtonIconData(null, jz.a.V0, null, null, BadgeData.INSTANCE.a(value, label, mx.b.b("nieprzeczytanych wiadomości", "")), new er.a() { // from class: kp1.e
            @Override // er.a
            public final Object a() {
                return f.f();
            }
        }, 13, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    private final BadgeData<d40.b.C0864b> h(int value, Label label) {
        return new BadgeData<>(value, new d40.b.C0864b("badge-preview-content", jz.a.f106756d4, d40.i.f.f39709e, null, BadgeData.INSTANCE.a(value, label, mx.b.b("nieprzeczytanych wiadomości", "")), d40.j.ENABLED, 8, null));
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public j.Data b(a params) {
        return new j.Data(h(1, mx.b.b("eDoręczenia", "")), h(11, mx.b.b("eDoręczenia", "")), e(111, mx.b.b("eDoręczenia", "")));
    }
}
