package c12;

import fr.t;
import fu.r;
import oq.p;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \r2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\r\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lc12/a;", "Lxw/f;", "Lc12/a$b;", "", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lc12/a$b;)Ljava/lang/String;", "a", "Lmx/c;", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22569c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c12.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lc12/a$b;", "", "", "subject", "Lz02/a;", "entryMessageType", "<init>", "(Ljava/lang/String;Lz02/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lz02/a;", "()Lz02/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String subject;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final z02.a entryMessageType;

        public Params(String str, z02.a aVar) {
            this.subject = str;
            this.entryMessageType = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final z02.a getEntryMessageType() {
            return this.entryMessageType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubject() {
            return this.subject;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.subject, params.subject) && t.c(this.entryMessageType, params.entryMessageType);
        }

        public int hashCode() {
            String str = this.subject;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.entryMessageType.hashCode();
        }

        public String toString() {
            return "Params(subject=" + this.subject + ", entryMessageType=" + this.entryMessageType + ')';
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private static final String e(String str, a aVar, String str2) {
        String text = aVar.labelProvider.c(c20.f.f22753a).getText();
        if (!r.V(str, str2, false, 2, null)) {
            str = str2 + str;
        }
        int length = (str.length() + text.length()) - GF2Field.MASK;
        if (str.length() <= 255) {
            return str;
        }
        return r.B1(str, length) + text;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(Params params) {
        z02.a entryMessageType = params.getEntryMessageType();
        if ((entryMessageType instanceof z02.a.EditDraft) || t.c(entryMessageType, z02.a.c.f231893a)) {
            return params.getSubject();
        }
        if (entryMessageType instanceof z02.a.ForwardMessage) {
            String subject = params.getSubject();
            if (subject != null) {
                return e(subject, this, "FW: ");
            }
            return null;
        }
        if (!(entryMessageType instanceof z02.a.Reply)) {
            throw new p();
        }
        String subject2 = params.getSubject();
        if (subject2 != null) {
            return e(subject2, this, "RE: ");
        }
        return null;
    }
}
