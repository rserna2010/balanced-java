% if mode == 'definition':
Debit().dispute

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Debit debit = new Debit("/debits/WDJ66VlXnDyDx5AS5uplxyt");
Dispute dispute = debit.dispute;

% endif

