package ld2;

import gd2.SummaryModel;
import kd2.WelcomeResult;
import p071kotlin.Metadata;
import p139yc2.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lld2/b;", "Lld2/a;", "Lh00/a;", "Lyc2/a0;", "", "Lgd2/a;", "Lpl/gov/coi/mobywatel/feature/identitycardsuspension/presentation/wizard/SuspensionDataSource;", "dataSource", "<init>", "(Lh00/a;)V", "Lkd2/a;", "result", "Loq/i0;", "a", "(Lkd2/a;)V", "Lh00/a;", "b", "()Lgd2/a;", "summaryModel", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f117913b = h00.a.f79185b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h00.a<a0, Object, SummaryModel> dataSource;

    public b(h00.a<a0, Object, SummaryModel> aVar) {
        this.dataSource = aVar;
    }

    @Override // id2.a
    public void a(WelcomeResult result) {
        this.dataSource.a(a0.f.f226333b, result);
    }

    @Override // ed2.a
    public SummaryModel b() {
        return this.dataSource.e();
    }
}
