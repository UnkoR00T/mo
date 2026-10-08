package d30;

import fr.k;
import fr.t;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d30.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Ld30/a;", "CONTENT", "", "", "value", "content", "<init>", "(ILjava/lang/Object;)V", "", "b", "()Ljava/lang/String;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BadgeData<CONTENT> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39532d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CONTENT content;

    /* JADX INFO: renamed from: d30.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ld30/a$a;", "", "<init>", "()V", "", "value", "", "b", "(I)Ljava/lang/String;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "badgeContextContentDescription", "a", "(ILmx/a;Lmx/a;)Lmx/a;", "MAX_VALUE", "Ljava/lang/String;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Label a(int value, Label label, Label badgeContextContentDescription) {
            if (value <= 0) {
                return label;
            }
            return label.o(Label.INSTANCE.d()).o(badgeContextContentDescription).o(new Label(' ' + b(value), ""));
        }

        public final String b(int value) {
            return value > 99 ? "99+" : String.valueOf(value);
        }

        private Companion() {
        }
    }

    public BadgeData(int i15, CONTENT content) {
        this.value = i15;
        this.content = content;
    }

    public final CONTENT a() {
        return this.content;
    }

    public final String b() {
        return INSTANCE.b(this.value);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeData)) {
            return false;
        }
        BadgeData badgeData = (BadgeData) other;
        return this.value == badgeData.value && t.c(this.content, badgeData.content);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.value) * 31;
        CONTENT content = this.content;
        return iHashCode + (content == null ? 0 : content.hashCode());
    }

    public String toString() {
        return "BadgeData(value=" + this.value + ", content=" + this.content + ')';
    }
}
