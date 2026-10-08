package r70;

import fr.t;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: r70.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lr70/a;", "", "", "iconResId", "Lr70/a$a;", "fabType", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(ILr70/a$a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lr70/a$a;", "()Lr70/a$a;", "c", "Ler/a;", "()Ler/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BaseFloatingActionButtonData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC4389a fabType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    /* JADX INFO: renamed from: r70.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lr70/a$a;", "", "b", "a", "Lr70/a$a$a;", "Lr70/a$a$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC4389a {

        /* JADX INFO: renamed from: r70.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lr70/a$a$a;", "Lr70/a$a;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Extended implements InterfaceC4389a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label label;

            public Extended(Label label) {
                this.label = label;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getLabel() {
                return this.label;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Extended) && t.c(this.label, ((Extended) other).label);
            }

            public int hashCode() {
                return this.label.hashCode();
            }

            public String toString() {
                return "Extended(label=" + this.label + ')';
            }
        }

        /* JADX INFO: renamed from: r70.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lr70/a$a$b;", "Lr70/a$a;", "Lmx/a;", "contentDescription", "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Icon implements InterfaceC4389a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label contentDescription;

            public Icon(Label label) {
                this.contentDescription = label;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getContentDescription() {
                return this.contentDescription;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Icon) && t.c(this.contentDescription, ((Icon) other).contentDescription);
            }

            public int hashCode() {
                return this.contentDescription.hashCode();
            }

            public String toString() {
                return "Icon(contentDescription=" + this.contentDescription + ')';
            }
        }
    }

    public BaseFloatingActionButtonData(int i15, InterfaceC4389a interfaceC4389a, er.a<i0> aVar) {
        this.iconResId = i15;
        this.fabType = interfaceC4389a;
        this.onClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC4389a getFabType() {
        return this.fabType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    public final er.a<i0> c() {
        return this.onClick;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseFloatingActionButtonData)) {
            return false;
        }
        BaseFloatingActionButtonData baseFloatingActionButtonData = (BaseFloatingActionButtonData) other;
        return this.iconResId == baseFloatingActionButtonData.iconResId && t.c(this.fabType, baseFloatingActionButtonData.fabType) && t.c(this.onClick, baseFloatingActionButtonData.onClick);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.iconResId) * 31) + this.fabType.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "BaseFloatingActionButtonData(iconResId=" + this.iconResId + ", fabType=" + this.fabType + ", onClick=" + this.onClick + ')';
    }
}
