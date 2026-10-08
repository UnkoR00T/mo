package p30;

import java.util.List;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lp30/a;", "", "b", "a", "c", "Lp30/a$a;", "Lp30/a$b;", "Lp30/a$c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: p30.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp30/a$b;", "Lp30/a;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f152612b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        public Loading(Label label) {
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
            return (other instanceof Loading) && fr.t.c(this.label, ((Loading) other).label);
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return "Loading(label=" + this.label + ')';
        }
    }

    /* JADX INFO: renamed from: p30.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp30/a$c;", "Lp30/a;", "Lmx/a;", "content", "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OutgoingMessage implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f152614b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label content;

        public OutgoingMessage(Label label) {
            this.content = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OutgoingMessage) && fr.t.c(this.content, ((OutgoingMessage) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "OutgoingMessage(content=" + this.content + ')';
        }
    }

    /* JADX INFO: renamed from: p30.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Jl\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b%\u0010+R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b,\u0010/¨\u00060"}, d2 = {"Lp30/a$a;", "Lp30/a;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lp30/a$a$a;", "content", "additionalInfo", "Lp30/a0;", "footerData", "", "Lp30/t;", "actions", "suggestions", "Ll3/d0;", "focusRequester", "<init>", "(Lmx/a;Lp30/a$a$a;Lmx/a;Lp30/a0;Ljava/util/List;Ljava/util/List;Ll3/d0;)V", "a", "(Lmx/a;Lp30/a$a$a;Lmx/a;Lp30/a0;Ljava/util/List;Ljava/util/List;Ll3/d0;)Lp30/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "h", "()Lmx/a;", "b", "Lp30/a$a$a;", "e", "()Lp30/a$a$a;", "c", "d", "Lp30/a0;", "g", "()Lp30/a0;", "Ljava/util/List;", "()Ljava/util/List;", "f", "i", "Ll3/d0;", "()Ll3/d0;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncomingMessage implements a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f152602h = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC3749a content;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label additionalInfo;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final FooterData footerData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ClickableContent> actions;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ClickableContent> suggestions;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l3.d0 focusRequester;

        /* JADX INFO: renamed from: p30.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lp30/a$a$a;", "", "a", "b", "Lp30/a$a$a$a;", "Lp30/a$a$a$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC3749a {

            /* JADX INFO: renamed from: p30.a$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp30/a$a$a$a;", "Lp30/a$a$a;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Static implements InterfaceC3749a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label label;

                public Static(Label label) {
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
                    return (other instanceof Static) && fr.t.c(this.label, ((Static) other).label);
                }

                public int hashCode() {
                    return this.label.hashCode();
                }

                public String toString() {
                    return "Static(label=" + this.label + ')';
                }
            }

            /* JADX INFO: renamed from: p30.a$a$a$b, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp30/a$a$a$b;", "Lp30/a$a$a;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WithAnimatedDots implements InterfaceC3749a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label label;

                public WithAnimatedDots(Label label) {
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
                    return (other instanceof WithAnimatedDots) && fr.t.c(this.label, ((WithAnimatedDots) other).label);
                }

                public int hashCode() {
                    return this.label.hashCode();
                }

                public String toString() {
                    return "WithAnimatedDots(label=" + this.label + ')';
                }
            }
        }

        public IncomingMessage(Label label, InterfaceC3749a interfaceC3749a, Label label2, FooterData footerData, List<ClickableContent> list, List<ClickableContent> list2, l3.d0 d0Var) {
            this.label = label;
            this.content = interfaceC3749a;
            this.additionalInfo = label2;
            this.footerData = footerData;
            this.actions = list;
            this.suggestions = list2;
            this.focusRequester = d0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IncomingMessage b(IncomingMessage incomingMessage, Label label, InterfaceC3749a interfaceC3749a, Label label2, FooterData footerData, List list, List list2, l3.d0 d0Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                label = incomingMessage.label;
            }
            if ((i15 & 2) != 0) {
                interfaceC3749a = incomingMessage.content;
            }
            if ((i15 & 4) != 0) {
                label2 = incomingMessage.additionalInfo;
            }
            if ((i15 & 8) != 0) {
                footerData = incomingMessage.footerData;
            }
            if ((i15 & 16) != 0) {
                list = incomingMessage.actions;
            }
            if ((i15 & 32) != 0) {
                list2 = incomingMessage.suggestions;
            }
            if ((i15 & 64) != 0) {
                d0Var = incomingMessage.focusRequester;
            }
            List list3 = list2;
            l3.d0 d0Var2 = d0Var;
            List list4 = list;
            Label label3 = label2;
            return incomingMessage.a(label, interfaceC3749a, label3, footerData, list4, list3, d0Var2);
        }

        public final IncomingMessage a(Label label, InterfaceC3749a content, Label additionalInfo, FooterData footerData, List<ClickableContent> actions, List<ClickableContent> suggestions, l3.d0 focusRequester) {
            return new IncomingMessage(label, content, additionalInfo, footerData, actions, suggestions, focusRequester);
        }

        public final List<ClickableContent> c() {
            return this.actions;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getAdditionalInfo() {
            return this.additionalInfo;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC3749a getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IncomingMessage)) {
                return false;
            }
            IncomingMessage incomingMessage = (IncomingMessage) other;
            return fr.t.c(this.label, incomingMessage.label) && fr.t.c(this.content, incomingMessage.content) && fr.t.c(this.additionalInfo, incomingMessage.additionalInfo) && fr.t.c(this.footerData, incomingMessage.footerData) && fr.t.c(this.actions, incomingMessage.actions) && fr.t.c(this.suggestions, incomingMessage.suggestions) && fr.t.c(this.focusRequester, incomingMessage.focusRequester);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final l3.d0 getFocusRequester() {
            return this.focusRequester;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final FooterData getFooterData() {
            return this.footerData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        public int hashCode() {
            int iHashCode = ((this.label.hashCode() * 31) + this.content.hashCode()) * 31;
            Label label = this.additionalInfo;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            FooterData footerData = this.footerData;
            int iHashCode3 = (iHashCode2 + (footerData == null ? 0 : footerData.hashCode())) * 31;
            List<ClickableContent> list = this.actions;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            List<ClickableContent> list2 = this.suggestions;
            int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            l3.d0 d0Var = this.focusRequester;
            return iHashCode5 + (d0Var != null ? d0Var.hashCode() : 0);
        }

        public final List<ClickableContent> i() {
            return this.suggestions;
        }

        public String toString() {
            return "IncomingMessage(label=" + this.label + ", content=" + this.content + ", additionalInfo=" + this.additionalInfo + ", footerData=" + this.footerData + ", actions=" + this.actions + ", suggestions=" + this.suggestions + ", focusRequester=" + this.focusRequester + ')';
        }

        public /* synthetic */ IncomingMessage(Label label, InterfaceC3749a interfaceC3749a, Label label2, FooterData footerData, List list, List list2, l3.d0 d0Var, int i15, fr.k kVar) {
            this(label, interfaceC3749a, (i15 & 4) != 0 ? null : label2, (i15 & 8) != 0 ? null : footerData, (i15 & 16) != 0 ? null : list, (i15 & 32) != 0 ? null : list2, (i15 & 64) != 0 ? null : d0Var);
        }
    }
}
