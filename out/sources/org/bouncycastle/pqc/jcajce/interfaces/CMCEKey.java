package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public interface CMCEKey extends Key {
    CMCEParameterSpec getParameterSpec();
}
