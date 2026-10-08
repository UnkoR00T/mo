package j82;

import h30.ButtonData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lj82/c;", "Ll00/e;", "Lj82/c$a;", "a", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lj82/c$a;", "", "a", "b", "Lj82/c$a$a;", "Lj82/c$a$b;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: j82.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj82/c$a$a;", "Lj82/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C2349a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2349a f100201a = new C2349a();

            private C2349a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2349a);
            }

            public int hashCode() {
                return 1321483216;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: j82.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001b\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b$\u0010)¨\u0006*"}, d2 = {"Lj82/c$a$b;", "Lj82/c$a;", "Lmx/a;", "headerText", "", "Lj82/c$a$b$a;", "inputs", "Lh30/a;", "buttonData", "Lm82/a;", "scrollToField", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToField", "<init>", "(Lmx/a;Ljava/util/List;Lh30/a;Lm82/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lh30/a;", "()Lh30/a;", "d", "Lm82/a;", "e", "()Lm82/a;", "Ler/a;", "()Ler/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitializedData implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerText;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Input> inputs;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final m82.a scrollToField;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onScrolledToField;

            /* JADX INFO: renamed from: j82.c$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lj82/c$a$b$a;", "", "Lm82/a;", "type", "Lv50/c;", "data", "<init>", "(Lm82/a;Lv50/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm82/a;", "b", "()Lm82/a;", "Lv50/c;", "()Lv50/c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Input {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f100207c = v50.c.f203957t;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final m82.a type;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final v50.c data;

                public Input(m82.a aVar, v50.c cVar) {
                    this.type = aVar;
                    this.data = cVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final v50.c getData() {
                    return this.data;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final m82.a getType() {
                    return this.type;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Input)) {
                        return false;
                    }
                    Input input = (Input) other;
                    return this.type == input.type && fr.t.c(this.data, input.data);
                }

                public int hashCode() {
                    return (this.type.hashCode() * 31) + this.data.hashCode();
                }

                public String toString() {
                    return "Input(type=" + this.type + ", data=" + this.data + ')';
                }
            }

            public InitializedData(Label label, List<Input> list, ButtonData buttonData, m82.a aVar, er.a<i0> aVar2) {
                this.headerText = label;
                this.inputs = list;
                this.buttonData = buttonData;
                this.scrollToField = aVar;
                this.onScrolledToField = aVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getHeaderText() {
                return this.headerText;
            }

            public final List<Input> c() {
                return this.inputs;
            }

            public final er.a<i0> d() {
                return this.onScrolledToField;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final m82.a getScrollToField() {
                return this.scrollToField;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitializedData)) {
                    return false;
                }
                InitializedData initializedData = (InitializedData) other;
                return fr.t.c(this.headerText, initializedData.headerText) && fr.t.c(this.inputs, initializedData.inputs) && fr.t.c(this.buttonData, initializedData.buttonData) && this.scrollToField == initializedData.scrollToField && fr.t.c(this.onScrolledToField, initializedData.onScrolledToField);
            }

            public int hashCode() {
                int iHashCode = ((((this.headerText.hashCode() * 31) + this.inputs.hashCode()) * 31) + this.buttonData.hashCode()) * 31;
                m82.a aVar = this.scrollToField;
                return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.onScrolledToField.hashCode();
            }

            public String toString() {
                return "InitializedData(headerText=" + this.headerText + ", inputs=" + this.inputs + ", buttonData=" + this.buttonData + ", scrollToField=" + this.scrollToField + ", onScrolledToField=" + this.onScrolledToField + ')';
            }
        }
    }
}
