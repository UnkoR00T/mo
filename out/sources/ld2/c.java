package ld2;

import gd2.SummaryModel;
import kd2.WelcomeResult;
import p071kotlin.Metadata;
import p139yc2.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lld2/c;", "Lh00/a;", "Lyc2/a0;", "", "Lgd2/a;", "Lpl/gov/coi/mobywatel/feature/identitycardsuspension/presentation/wizard/SuspensionDataSource;", "<init>", "()V", "g", "()Lgd2/a;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends h00.a<a0, Object, SummaryModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f117915c = h00.a.f79185b;

    @Override // h00.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public SummaryModel e() {
        WelcomeResult.Data data = (WelcomeResult.Data) f(a0.f.f226333b);
        return new SummaryModel(data.getAction(), data.getIdCardSeriesAndNumber(), data.getUserEdorAddress());
    }
}
