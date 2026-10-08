package ds3;

import cj0.AccessibleZusEVisitDepartments;
import cj0.ZusEVisitTopic;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lds3/b;", "", "b", "a", "Lds3/b$a;", "Lds3/b$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: ds3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lds3/b$b;", "Lds3/b;", "Liy/b0;", "inputValue", "Lhz/b;", "inputState", "Lcj0/n;", "topic", "<init>", "(Liy/b0;Lhz/b;Lcj0/n;)V", "a", "(Liy/b0;Lhz/b;Lcj0/n;)Lds3/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "d", "()Liy/b0;", "b", "Lhz/b;", "c", "()Lhz/b;", "Lcj0/n;", "e", "()Lcj0/n;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitializedInput implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 inputValue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b inputState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ZusEVisitTopic topic;

        public InitializedInput() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ InitializedInput b(InitializedInput initializedInput, b0 b0Var, hz.b bVar, ZusEVisitTopic zusEVisitTopic, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = initializedInput.inputValue;
            }
            if ((i15 & 2) != 0) {
                bVar = initializedInput.inputState;
            }
            if ((i15 & 4) != 0) {
                zusEVisitTopic = initializedInput.topic;
            }
            return initializedInput.a(b0Var, bVar, zusEVisitTopic);
        }

        public final InitializedInput a(b0 inputValue, hz.b inputState, ZusEVisitTopic topic) {
            return new InitializedInput(inputValue, inputState, topic);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getInputState() {
            return this.inputState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getInputValue() {
            return this.inputValue;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ZusEVisitTopic getTopic() {
            return this.topic;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitializedInput)) {
                return false;
            }
            InitializedInput initializedInput = (InitializedInput) other;
            return fr.t.c(this.inputValue, initializedInput.inputValue) && fr.t.c(this.inputState, initializedInput.inputState) && fr.t.c(this.topic, initializedInput.topic);
        }

        public int hashCode() {
            int iHashCode = ((this.inputValue.hashCode() * 31) + this.inputState.hashCode()) * 31;
            ZusEVisitTopic zusEVisitTopic = this.topic;
            return iHashCode + (zusEVisitTopic == null ? 0 : zusEVisitTopic.hashCode());
        }

        public String toString() {
            return "InitializedInput(inputValue=" + this.inputValue + ", inputState=" + this.inputState + ", topic=" + this.topic + ')';
        }

        public InitializedInput(b0 b0Var, hz.b bVar, ZusEVisitTopic zusEVisitTopic) {
            this.inputValue = b0Var;
            this.inputState = bVar;
            this.topic = zusEVisitTopic;
        }

        public /* synthetic */ InitializedInput(b0 b0Var, hz.b bVar, ZusEVisitTopic zusEVisitTopic, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 4) != 0 ? null : zusEVisitTopic);
        }
    }

    /* JADX INFO: renamed from: ds3.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lds3/b$a;", "Lds3/b;", "Lcj0/a;", "accessibleDepartments", "", "isForceOpenedWithDefaultPostcode", "Lcj0/n;", "topic", "<init>", "(Lcj0/a;ZLcj0/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcj0/a;", "()Lcj0/a;", "b", "Z", "c", "()Z", "Lcj0/n;", "()Lcj0/n;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FoundDepartment implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AccessibleZusEVisitDepartments accessibleDepartments;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isForceOpenedWithDefaultPostcode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ZusEVisitTopic topic;

        public FoundDepartment(AccessibleZusEVisitDepartments accessibleZusEVisitDepartments, boolean z15, ZusEVisitTopic zusEVisitTopic) {
            this.accessibleDepartments = accessibleZusEVisitDepartments;
            this.isForceOpenedWithDefaultPostcode = z15;
            this.topic = zusEVisitTopic;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AccessibleZusEVisitDepartments getAccessibleDepartments() {
            return this.accessibleDepartments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ZusEVisitTopic getTopic() {
            return this.topic;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsForceOpenedWithDefaultPostcode() {
            return this.isForceOpenedWithDefaultPostcode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FoundDepartment)) {
                return false;
            }
            FoundDepartment foundDepartment = (FoundDepartment) other;
            return fr.t.c(this.accessibleDepartments, foundDepartment.accessibleDepartments) && this.isForceOpenedWithDefaultPostcode == foundDepartment.isForceOpenedWithDefaultPostcode && fr.t.c(this.topic, foundDepartment.topic);
        }

        public int hashCode() {
            int iHashCode = ((this.accessibleDepartments.hashCode() * 31) + Boolean.hashCode(this.isForceOpenedWithDefaultPostcode)) * 31;
            ZusEVisitTopic zusEVisitTopic = this.topic;
            return iHashCode + (zusEVisitTopic == null ? 0 : zusEVisitTopic.hashCode());
        }

        public String toString() {
            return "FoundDepartment(accessibleDepartments=" + this.accessibleDepartments + ", isForceOpenedWithDefaultPostcode=" + this.isForceOpenedWithDefaultPostcode + ", topic=" + this.topic + ')';
        }

        public /* synthetic */ FoundDepartment(AccessibleZusEVisitDepartments accessibleZusEVisitDepartments, boolean z15, ZusEVisitTopic zusEVisitTopic, int i15, fr.k kVar) {
            this(accessibleZusEVisitDepartments, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? null : zusEVisitTopic);
        }
    }
}
