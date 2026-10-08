package e3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Le3/q;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Le3/a;", "trace", "<init>", "(Le3/a;)V", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "a", "Le3/a;", "", "getMessage", "()Ljava/lang/String;", "message", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a trace;

    public q(a aVar) {
        this.trace = aVar;
        if (aVar.getHasSourceInformation()) {
            return;
        }
        List<ComposeStackTraceFrame> listC = e.c(aVar);
        int size = listC.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i15 = 0; i15 < size; i15++) {
            stackTraceElementArr[i15] = new StackTraceElement("$$compose", "m$" + listC.get(i15).getGroupKey(), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (!this.trace.getHasSourceInformation()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Composition stack when thrown:");
        sb5.append('\n');
        e.a(sb5, this.trace);
        return sb5.toString();
    }
}
