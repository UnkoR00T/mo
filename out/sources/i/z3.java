package i;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b+\u0010\u0018R#\u0010\u000f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b'\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b$\u0010\u0016¨\u0006/"}, d2 = {"Li/z3;", "", "", "sessionType", "", "Li/j3;", "inputConfiguration", "Li/l3;", "outputConfigurations", "Ljava/util/concurrent/Executor;", "executor", "Li/k2$a;", "stateCallback", "sessionTemplateId", "", "sessionParameters", "Lh/k;", "sessionColorSpace", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/concurrent/Executor;Li/k2$a;ILjava/util/Map;Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "e", "Li/k2$a;", "h", "()Li/k2$a;", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "Ljava/lang/String;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int sessionType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<InputConfigData> inputConfiguration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<l3> outputConfigurations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k2.a stateCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int sessionTemplateId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<?, Object> sessionParameters;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String sessionColorSpace;

    public /* synthetic */ z3(int i15, List list, List list2, Executor executor, k2.a aVar, int i16, Map map, String str, fr.k kVar) {
        this(i15, list, list2, executor, aVar, i16, map, str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    public final List<InputConfigData> b() {
        return this.inputConfiguration;
    }

    public final List<l3> c() {
        return this.outputConfigurations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSessionColorSpace() {
        return this.sessionColorSpace;
    }

    public final Map<?, Object> e() {
        return this.sessionParameters;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    public boolean equals(Object other) {
        boolean zB;
        if (this == other) {
            return true;
        }
        if (!(other instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) other;
        if (this.sessionType != z3Var.sessionType || !fr.t.c(this.inputConfiguration, z3Var.inputConfiguration) || !fr.t.c(this.outputConfigurations, z3Var.outputConfigurations) || !fr.t.c(this.executor, z3Var.executor) || !fr.t.c(this.stateCallback, z3Var.stateCallback) || this.sessionTemplateId != z3Var.sessionTemplateId || !fr.t.c(this.sessionParameters, z3Var.sessionParameters)) {
            return false;
        }
        String str = this.sessionColorSpace;
        String str2 = z3Var.sessionColorSpace;
        if (str == null) {
            if (str2 == null) {
                zB = true;
            } else {
                zB = false;
            }
        } else if (str2 == null) {
            zB = false;
        } else {
            zB = h.k.b(str, str2);
        }
        return zB;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSessionTemplateId() {
        return this.sessionTemplateId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSessionType() {
        return this.sessionType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final k2.a getStateCallback() {
        return this.stateCallback;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.sessionType) * 31;
        List<InputConfigData> list = this.inputConfiguration;
        int iHashCode2 = (((((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.outputConfigurations.hashCode()) * 31) + this.executor.hashCode()) * 31) + this.stateCallback.hashCode()) * 31) + Integer.hashCode(this.sessionTemplateId)) * 31) + this.sessionParameters.hashCode()) * 31;
        String str = this.sessionColorSpace;
        return iHashCode2 + (str != null ? h.k.c(str) : 0);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SessionConfigData(sessionType=");
        sb5.append(this.sessionType);
        sb5.append(", inputConfiguration=");
        sb5.append(this.inputConfiguration);
        sb5.append(", outputConfigurations=");
        sb5.append(this.outputConfigurations);
        sb5.append(", executor=");
        sb5.append(this.executor);
        sb5.append(", stateCallback=");
        sb5.append(this.stateCallback);
        sb5.append(", sessionTemplateId=");
        sb5.append(this.sessionTemplateId);
        sb5.append(", sessionParameters=");
        sb5.append(this.sessionParameters);
        sb5.append(", sessionColorSpace=");
        String str = this.sessionColorSpace;
        sb5.append((Object) (str == null ? "null" : h.k.e(str)));
        sb5.append(')');
        return sb5.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private z3(int i15, List<InputConfigData> list, List<? extends l3> list2, Executor executor, k2.a aVar, int i16, Map<?, ? extends Object> map, String str) {
        this.sessionType = i15;
        this.inputConfiguration = list;
        this.outputConfigurations = list2;
        this.executor = executor;
        this.stateCallback = aVar;
        this.sessionTemplateId = i16;
        this.sessionParameters = map;
        this.sessionColorSpace = str;
    }
}
