package fc;

import cc.SystemIdInfo;
import cc.i0;
import cc.p;
import cc.r1;
import cc.t1;
import cc.y;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import ub.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcc/y;", "workNameDao", "Lcc/t1;", "workTagDao", "Lcc/p;", "systemIdInfoDao", "", "Lcc/i0;", "workSpecs", "", "d", "(Lcc/y;Lcc/t1;Lcc/p;Ljava/util/List;)Ljava/lang/String;", "workSpec", "name", "", "systemId", "tags", "c", "(Lcc/i0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61085a = w.i("DiagnosticsWrkr");

    private static final String c(i0 i0Var, String str, Integer num, String str2) {
        return '\n' + i0Var.id + "\t " + i0Var.workerClassName + "\t " + num + "\t " + i0Var.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(y yVar, t1 t1Var, p pVar, List<i0> list) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (i0 i0Var : list) {
            SystemIdInfo systemIdInfoC = pVar.c(r1.a(i0Var));
            sb5.append(c(i0Var, v.v0(yVar.a(i0Var.id), ",", null, null, 0, null, null, 62, null), systemIdInfoC != null ? Integer.valueOf(systemIdInfoC.systemId) : null, v.v0(t1Var.a(i0Var.id), ",", null, null, 0, null, null, 62, null)));
        }
        return sb5.toString();
    }
}
