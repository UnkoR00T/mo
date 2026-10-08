package e3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0004\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Le3/a0;", "", "", "isCall", "isInline", "", "functionName", "sourceFile", "", "Le3/w;", "parameters", "packageHash", "Le3/t;", "locations", "rawData", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "a", "Z", "e", "()Z", "b", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "f", "g", "h", "getRawData", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isCall;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isInline;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String functionName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String sourceFile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<w> parameters;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String packageHash;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<t> locations;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String rawData;

    public a0(boolean z15, boolean z16, String str, String str2, List<w> list, String str3, List<t> list2, String str4) {
        this.isCall = z15;
        this.isInline = z16;
        this.functionName = str;
        this.sourceFile = str2;
        this.parameters = list;
        this.packageHash = str3;
        this.locations = list2;
        this.rawData = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFunctionName() {
        return this.functionName;
    }

    public final List<t> b() {
        return this.locations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPackageHash() {
        return this.packageHash;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSourceFile() {
        return this.sourceFile;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsCall() {
        return this.isCall;
    }
}
