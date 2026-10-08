package vr;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface b extends vr.a, e0 {

    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean b() {
            return this != FAKE_OVERRIDE;
        }
    }

    void H0(Collection<? extends b> collection);

    @Override // vr.a, vr.m
    b a();

    @Override // vr.a
    Collection<? extends b> e();

    b g0(m mVar, f0 f0Var, u uVar, a aVar, boolean z15);

    a k();
}
